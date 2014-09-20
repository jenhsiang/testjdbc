package testjdbc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import testjdbc.DbBean;

public class todo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbBean dd = new DbBean();
		List ll =  dd.SelectRS("select * from CalValue");
		for(int i=0;i<ll.size();i++){
			Map map = (Map)ll.get(i); 
			System.out.println(ll.get(i).toString());
			System.out.println(map.get("Frequency").toString());
			System.out.println(map.get("Loss").toString());
			
		}
		
		List<Double> myList = new ArrayList<Double>();
		
		//£¸¦¸¦s£¸µ§
		myList.add(0,(double) 2*1E6);
		myList.add(1,(double) 9);
		//
		
		int result = dd.InsertData("insert into CalValue(Frequency,Loss) values (?,?) ", myList);
		System.out.println(result);
		
	}

}
