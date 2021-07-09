package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Report;


public interface ReportService {
	public void addReport(Report Report);

	public List<Report> getAllReports();
	
	public List<Report> getAllReportsByDate();
	
	public List<Report> getAllReportsByCategory();


	public Report getReport(int reportid);

}
