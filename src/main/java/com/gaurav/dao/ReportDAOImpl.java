package com.gaurav.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Report;

@Repository
public class ReportDAOImpl implements ReportDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addReport(Report Report) {
		sessionFactory.getCurrentSession().saveOrUpdate(Report);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Report> getAllReports() {
		return sessionFactory.getCurrentSession().createQuery("from Report")
				.list();
	}

	@Override
	public Report getReport(int reportId) {
		return (Report) sessionFactory.getCurrentSession().get(
				Report.class, reportId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Report> getAllReportsByDate() {
		return sessionFactory.getCurrentSession().createQuery("FROM Report R WHERE R.id > 0 ORDER BY R.purchaseDate DESC")
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Report> getAllReportsByCategory() {
		return sessionFactory.getCurrentSession().createQuery("FROM Report R WHERE R.id > 0 ORDER BY R.category DESC")
				.list();
	}

}
