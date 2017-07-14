package io.sample.texttruncservice.App;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class SubscriptionServiceImp implements SubscriptionService{

	@Override
	public String truncate(String orderDetails, int number) {
		// TODO Auto-generated method stub
		
		String orderdetails="";
		if (orderDetails!=null && orderDetails.length()>number && number >=21){
			
			String subOrderDetails=orderDetails.substring(0,number);
			double pos = number-21;
			int posValue=(int)(Math.round(pos/2));
			double valueDiff=((Math.round(pos/2))-pos/2);
			if(valueDiff==0){
				
				String frontChar=subOrderDetails.substring(0,posValue);
				//String endChar=subOrderDetails.substring(Math.max(0, subOrderDetails.length() - posValue));
				String endChar=orderDetails.substring(Math.max(0, orderDetails.length() - posValue));
				StringBuffer str = new StringBuffer(frontChar);
				str.append(" ... (truncated) ... ");
				str.append(endChar);
				orderdetails=str.toString();
				
			}
			else{
				
				String frontChar=subOrderDetails.substring(0,posValue);
				//String endChar=subOrderDetails.substring(Math.max(0, subOrderDetails.length() - (posValue-1)));
				String endChar=orderDetails.substring(Math.max(0, orderDetails.length() - (posValue-1)));
				StringBuffer str = new StringBuffer(frontChar);
				str.append(" ... (truncated) ... ");
				str.append(endChar);
				orderdetails=str.toString();
				
			}
		}
		else{
			orderdetails=orderDetails;
			
		}
		System.out.println("result is "+orderdetails);
		return orderdetails ;
		
		} 
		
	
	
	

}
