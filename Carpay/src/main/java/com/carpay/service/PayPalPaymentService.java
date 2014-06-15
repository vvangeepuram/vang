package com.carpay.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class PayPalPaymentService {
	
	private String getQueryString(Map<String,String> queryString) {
		StringBuilder result = new StringBuilder();
		boolean first = true;
		for(String key : queryString.keySet()) {
			if(first) {
				first = false;
			} else {
				result.append("&");
			}
			try {
				result.append(URLEncoder.encode(key, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result.append("=");
			try {
				result.append(URLEncoder.encode(queryString.get(key), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result.toString();
		
		}

}
