

import java.lang.reflect.Executable;

	 class Tickets {
		 int noOfTickets=5;
	


		void bookTicket(int noOfTickets)throws TicketNotAvailableException
		{
		if(noOfTickets > 5)
			throw new TicketNotAvailableException();
		else if(this.noOfTickets >= noOfTickets)
			this.noOfTickets -= noOfTickets;
		else
			throw new TicketNotAvailableException();
		

		}
		
		
		}
	 class TicketNotAvailableException extends Exception{

		@Override
		public String getMessage() {
		return "Tickes sold out";
		}
		}
	public class ExceptionDemo {

		public static void main(String[] args) {

		Tickets ticket=new Tickets();
		try{
		ticket.bookTicket(3);
		System.out.println("TICKETS BOOKED");
		}
		
		catch (TicketNotAvailableException e) {
		System.out.println(e.getMessage());
		}


		try{
		ticket.bookTicket(3);
		System.out.println("TICKETS BOOKED");
		}
		catch (TicketNotAvailableException e) {
		System.out.println(e.getMessage());
		}



		}

		}


