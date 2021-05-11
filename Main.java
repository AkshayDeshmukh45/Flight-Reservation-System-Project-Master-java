package com.upgrad.frs;

public class Main {

  public static void main(String[] args) {
       printTicketDetails();
    }

  public static void printTicketDetails(Ticket ticket){
    Flight flight = new Flight("A545", "IndiGo", 550,490);

    Passenger passenger = new Passenger("mumbai", "delhi", "West Bengal", "Shrushti", "0987654321", "shrushti23@gmail.com");

    RegularTicket rt = new RegularTicket("A23", "delhi", "Chennai", flight, "11/03/21 09:15Am", "11/03/21 12:25Pm", passenger, "A09", 5000, false, "Food and spa included");
    TouristTicket tt = new TouristTicket("B24", "delhi", "Chennai", flight, "11/03/21 09:15Am", "11/03/21 12:25Pm", passenger, "C13", 4500, false, "Manila Villa");
    System.out.println(rt.getPnr());
    System.out.println(tt.getPnr());

  }

  }







