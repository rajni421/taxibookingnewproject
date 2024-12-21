package tech.codehunt.service;

import java.util.List;

import tech.codehunt.model.BookingForm;


public interface BookingFormService {

	public BookingForm saveBookingFormService(BookingForm bookingForm);
	public List <BookingForm> readAllBokkingsService();
	public void deleteBookingService(int id);
}
