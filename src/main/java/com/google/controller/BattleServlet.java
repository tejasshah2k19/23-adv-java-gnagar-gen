package com.google.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BattleServlet")
public class BattleServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String a = request.getParameter("cardA");// 56,78,23,34,53
		String b = request.getParameter("cardB");// 87,93,45,23,22

		boolean isError = false;

		if (a == null || a.trim().length() == 0) {
			isError = true;
			request.setAttribute("aError", "Please Enter Value");
		}

		if (b == null || b.trim().length() == 0) {
			isError = true;
			request.setAttribute("bError", "Please Enter Value");
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InputCard.jsp");
			rd.forward(request, response);
		} else {

//			int cardA = Integer.parseInt(a);
//			int cardB = Integer.parseInt(b);
//
//			ArrayList<Integer> listA = new ArrayList<Integer>();
//			ArrayList<Integer> listB = new ArrayList<Integer>();
//			
//			listA.add(cardA);
//			listB.add(cardB); 
//			
//			request.setAttribute("listA", listA);
//			request.setAttribute("listB", listB);
//
//			if(cardA > cardB) {
//				request.setAttribute("winner", "A is Winner");
//			}else if(cardB > cardA ) {
//				request.setAttribute("winner", "B is Winner");
//			}else {
//				request.setAttribute("winner", "Draw");
//			}

//			RequestDispatcher rd = request.getRequestDispatcher("BattleResult.jsp");
//			rd.forward(request, response);

			// multiple values winner

			String str1[] = a.split(",");// str1[0]="56",str1[1]=78,23,34,53
			String str2[] = b.split(",");

			ArrayList<Integer> listA = new ArrayList<Integer>();
			ArrayList<Integer> listB = new ArrayList<Integer>();

			for (String x : str1) {
				listA.add(Integer.parseInt(x));
			}

			for (String x : str2) {
				listB.add(Integer.parseInt(x));
			}

			int aMax = listA.get(0);
			int bMax = listB.get(0);

			for (int x : listA) {
				if (aMax < x) {
					aMax = x;
				}
			}

			for (int x : listB) {
				if (bMax < x) {
					bMax = x;
				}
			}

			if (aMax > bMax) {
				request.setAttribute("winner", "A is Winner");
			} else if (bMax > aMax) {
				request.setAttribute("winner", "B is Winner");
			} else {
				request.setAttribute("winner", "Draw");
			}

			request.setAttribute("listA", listA);
			request.setAttribute("listB", listB);

			RequestDispatcher rd = request.getRequestDispatcher("BattleResult.jsp");
			rd.forward(request, response);

		} // else

	}// service
}// class
