package com.taopik.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taopik.web.dao.DosenDao;
import com.taopik.web.models.Dosen;

/**
 * Servlet implementation class DosenServlet
 */
@WebServlet("/DosenServlet")
public class DosenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static DosenDao dao;
    public DosenServlet() {
        super();
        dao = new DosenDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("delete")){
			String nip = request.getParameter("nip");
			int nipInt = Integer.parseInt(nip);
			try {
				dao.deleteDosen(nipInt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		} else if (action.equalsIgnoreCase("ShowDosen")){
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		} else {
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("edit")){
			int nip = Integer.parseInt(request.getParameter("nip"));
			String nama = request.getParameter("nama");
			try {
				dao.updateDosen(nip, nama);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		} else if (action.equalsIgnoreCase("insert")){
			int nip = Integer.parseInt(request.getParameter("nip"));
			String nama = request.getParameter("nama");
			try {
				dao.setDosen(nip, nama);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		} else {
			List<Dosen> dosen = dao.getDosen();
			request.setAttribute("dataDosen", dosen);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDosen.jsp");
			rd.forward(request, response);
		}
		
	}

}
