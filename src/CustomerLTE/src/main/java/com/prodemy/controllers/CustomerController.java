package com.prodemy.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prodemy.models.Admin;
import com.prodemy.services.AdminService;
import com.prodemy.services.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CustomerController {
	@Autowired CustomerService cs;
	@Autowired AdminService as;
	@GetMapping("/show")
	public String show() throws IOException {
		return "display";
	}

	@GetMapping("/")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}

	@PostMapping("/login_action")
	public void checkCreds(@RequestParam("username") String unm, @RequestParam("password") String pwd,
			HttpServletRequest req, HttpServletResponse res) throws IOException { 
			Admin admin= as.getAdmin(unm);

		if (unm.equals(admin.getUsername()) && pwd.equals(admin.getPassword())) {
			req.getSession().setAttribute("username", unm);
			res.sendRedirect("show");
		} else {
			res.sendRedirect("login");
		}

	}

	@GetMapping("/logout")
	public void logoutAdminUser(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.getSession().invalidate();
		res.sendRedirect("login");
	}
}
