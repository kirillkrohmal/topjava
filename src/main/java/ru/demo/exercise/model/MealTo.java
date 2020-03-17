package ru.demo.exercise.model;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MealTo extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(MealTo.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.info("send response");

        resp.sendRedirect("view.jsp");
    }
}
