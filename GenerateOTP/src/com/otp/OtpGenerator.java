package com.otp;

import java.util.SplittableRandom;

/**
 * @author Vinod.nagulkar
 *
 */
public class OtpGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OtpGenerator.generateOtp(5));
	}

	public static String generateOtp(int otpLength)
	{
		SplittableRandom splittableRandom=new SplittableRandom();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < otpLength; i++) 
		{
			sb.append(splittableRandom.nextInt(0, 10));
			
		}
		return sb.toString();
	}
}
