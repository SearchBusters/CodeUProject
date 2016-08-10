package com.flatironschool.javacs;


public class Calculator{
	private TermCounter counter;
	private WikiCrawler index;
	private JedisIndex jedis;
	
	public Calculator(TermCounter newCounter, WikiCrawler newIndex, JedisIndex newJedis){
		counter = newCounter;
		index = newIndex;
		jedis = newJedis;
	}
	
	double idf(String s){
			return Math.log(index.counter/jedis.getURLs(s).size());
		}
		
	double tf_idf(String s){
		return idf(s) * counter.getPercentage(s);
	}
	
	
	public static void main(String[] args){
		System.out.println("Is it working???");
	}
}
