package br.edu.univas.agencia.voo;

import br.edu.univas.agencia.model.AgencyException;

public interface IFly {

	public FlyReservation reservRoom(FlyInfo info) throws AgencyException;
	
	public FlyPrice queryPrice(FlyQuery queryInfo) throws AgencyException;

	public FlyAvaliability queryAvaliability(FlyQuery queryInfo) throws AgencyException;

	public Report generateReport(FlyReportQuery reportQuery) throws AgencyException;
	
	public FlyDeparture queryAllCities(FlyArrival queryInfo);
}
