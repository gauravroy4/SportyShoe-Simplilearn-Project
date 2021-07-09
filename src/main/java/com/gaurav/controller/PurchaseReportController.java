package com.gaurav.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.model.Report;
import com.gaurav.service.ReportService;

@Controller
public class PurchaseReportController {
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(value = "/")
	public ModelAndView listReport1(ModelAndView model) throws IOException {
		List<Report> listReport = reportService.getAllReports();
		model.addObject("listReport", listReport);
		model.setViewName("purchaseReport");
		return model;
	}
	
	@RequestMapping(value = "/filterByDate")
	public ModelAndView listReport2(ModelAndView model) throws IOException {
		List<Report> listReport = reportService.getAllReportsByDate();
		model.addObject("listReport", listReport);
		model.setViewName("purchaseReport");
		return model;
	}
	
	@RequestMapping(value = "/filterByCategory")
	public ModelAndView listReport3(ModelAndView model) throws IOException {
		List<Report> listReport = reportService.getAllReportsByCategory();
		model.addObject("listReport", listReport);
		model.setViewName("purchaseReport");
		return model;
	}

}
