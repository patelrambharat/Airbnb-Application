package com.driver.AirbnbApplication.Controller;

import com.driver.AirbnbApplication.model.Booking;
import com.driver.AirbnbApplication.model.Facility;
import com.driver.AirbnbApplication.model.Hotel;
import com.driver.AirbnbApplication.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManagementService {
    HotelManagementRepository hotelManagementRepository = new HotelManagementRepository();

    public String addHotel(Hotel hotel) {
            String ans = hotelManagementRepository.addHotel(hotel);
            return ans;

    }

    public Integer addUser(User user) {
            int ans  = hotelManagementRepository.addUser(user);
            return ans;
    }

    public String getHotelWithMostFacilities() {
        return hotelManagementRepository.getHotelWithMostFacilities();
    }

    public int bookARoom(Booking booking) {
        int ans= hotelManagementRepository.bookAroom(booking);
        return ans;
    }

    public int getBookings(Integer aadharCard) {
        return hotelManagementRepository.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelManagementRepository.updateFacilities(newFacilities, hotelName);
    }
}
