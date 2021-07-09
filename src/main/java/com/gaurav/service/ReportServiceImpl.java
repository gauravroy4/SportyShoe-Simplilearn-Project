package com.gaurav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaurav.dao.ReportDAO;
import com.gaurav.model.Report;

@Service
@Transactional
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private ReportDAO reportDAO;

	@Override
	public void addReport(Report Report) {
		reportDAO.addReport(Report);
		
	}

	@Override
	public List<Report> getAllReports() {
		return reportDAO.getAllReports();
	}

	@Override
	public List<Report> getAllReportsByDate() {
		return reportDAO.getAllReportsByDate();
	}

	@Override
	public List<Report> getAllReportsByCategory() {
		return reportDAO.getAllReportsByCategory();
	}

	@Override
	public Report getReport(int reportid) {
		return reportDAO.getReport(reportid);
	}

	public void setReportDAO(ReportDAO reportDAO) {
		this.reportDAO = reportDAO;
	}

}
