package byCodeGame.game.scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestScheduled {
	private static ScheduledExecutorService testScheduled = new ScheduledThreadPoolExecutor(
			1);
	
	/**
	 * 启动调度任务
	 */
	public static void startScheduled() {
		test();
	}
	
	private static void test() {
		testScheduled.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println("Scheduled Test");
			}
		}, 1, 2, TimeUnit.SECONDS);
	}
	
//	
//	
//	
//	                          .::::.
//	                        .::::::::.
//	                       :::::::::::
//                      ..:::::::::::'
//                   '::::::::::::'
//	                   .::::::::::
//	              '::::::::::::::..
//	                   ..::::::::::::.
//	                 ``::::::::::::::::
//	                  ::::``:::::::::'        .:::.
//	                 ::::'   ':::::'       .::::::::.
//	               .::::'      ::::     .:::::::'::::.
//	              .:::'       :::::  .:::::::::' ':::::.
//	             .::'        :::::.:::::::::'      ':::::.
//	            .::'         ::::::::::::::'		 ``::::.
//	        ...:::           :::::::::::::'             ``::.
//	       ````':.           '::::::::::'                 ::::..
//	                          '.:::::'                    ':'````..
//	
//	
//	
//	
//		 .=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.
//		 |                     ______                     |
//		 |		            .-"      "-.                  |
//		 |	               /     wjh    \                 |
//		 |	   _          |              |          _     |
//		 |	  ( \         |,  .-.  .-.  ,|         / )    |
//		 |	   > "=._     | )(__/  \__)( |     _.=" <     |
//		 |    (_/"=._"=._ |/     /\     \| _.="_.="\_)    |
//		 |	         "=._"(_     ^^     _)"_.="           |
//		 |	             "=\__|IIIIII|__/="               |
//		 |	            _.="| \IIIIII/ |"=._              |
//		 |	  _     _.="_.="\          /"=._"=._     _    |
//		 |	 ( \_.="_.="     `________`     "=._"=._/ )   |
//		 |	  > _.="                            "=._ <    |
//		 |	 (_/                                    \_)   |
//		 |												  |
//		 '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-='
//	
//	
//	           		,%%%%%%%%,
//				  ,%%/\%%%%/\%%
//				 ,%%%\c	"" J/%%%         
//		%.       %%%%/ o  o \%%%
//		`%%.	 %%%%    _  |%%%
//		 `%%     `%%%%(__Y__)%%'
//		 //       ;%%%% \-/%%%'
//		((       /  `%%%%%%%%‘
//		 \\    .'           |
//		  \\  /       \   | |
//		   \\/	       )  | |
//			\         / _ | |__
//			(____________)))))))
//	
//	
//		    _			   \\
//		\. -(9>				\\_
//		 \==-)			 .---(')
//		 _'+			o( )_-\_
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
}
