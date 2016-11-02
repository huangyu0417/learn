package com.hy.test;

import org.junit.Test;

public class AssertDemo {	
	@Test
	public void test(){
	System.out.println("Insert into SDS.SDS_CODIFIERSGRPELT (CODIFIERSGRP_ID,CODIFIERS_ID,AUDITTIMESTAMP,DISPORDER) values (1002982,1002979,to_timestamp('15-8月 -16 10.46.00.997000000 上午','DD-MON-RR HH.MI.SS.FF AM'),0);".replaceAll("to_timestamp[(](.*)['][)]", "AA"));
	}
}
