package com.example.calculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RequestForwarder extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/simpleinterestandamountcalculator");

		dispatcher.forward(req, resp);
	}
}
