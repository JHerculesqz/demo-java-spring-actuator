#设计目标#
 
实现Spring中的自定义Actuator，实现获取内存中的数据
	
#实现原理#
	
1.MonitorUserprovider 

模拟内存中存储的业务数据，其中维护一个阻塞型队列，提供getCache和setCache的方法。

2.MonitorUserEndPoint

自定义的Endpoint，其中Id为唯一标识，invoke方法中调用getCache的方法，获取内存数据并清除

3.MarvelMSMonitorUserSDK

对MonitorUserprovider的进一步封装，getprovider（）方法获取Bean

#使用方法#

client端调用MarvelMSMonitorUserSDK来setCache，访问

	http://localhost:7000/marvel_ms_monitor_user
即可获取内存中的MonitorUserprovider队列中的实时数据，刷新后会看到队列中数据已被清空。
	
#reference#

http://www.jianshu.com/p/9fab4e81d7bb
	
	