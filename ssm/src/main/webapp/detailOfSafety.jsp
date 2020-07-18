    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询结果页面</title>
<style type="text/css">
a{
border:1px solid #dfb665;
padding:5px 7px;
color:blue;
}
</style>
</head>
<body>


<form class="layui-form" action="${pageContext.request.contextPath}/safety/show" method="post">
<div style="height:40px;width:300px;">
<div style="float:left;margin-left:10px;height:30px;text-align:center;margin-top:0px">
<input type="text" name="date" id="date" lay-verify="date" placeholder="选择(当前:${cordate})" autocomplete="off" class="layui-input" style="height:25px;margin-top:4px;float:left;">
</div>
<div style="float:left;margin-left:10px;height:30px;text-align:center;margin-top:0px">
<input type="submit" value="查询" style="background-color:darkcyan;margin-top:4px;float:right;">
</div>
<div style="float:right;height:30px;text-align:center;margin-top:5px">
<a  href="${pageContext.request.contextPath}/safety/export?dates=${cordate}" style="background-color:powderblue" method="post">导出</a>
</div>
</div>

<script src="layDate/laydate/laydate.js"></script> <!-- 改成你的路径 -->
<script>
lay('#version').html('-v'+ laydate.v);

//执行一个laydate实例
laydate.render({
  elem: '#date' //指定元素
});
</script>
     <br>        
       &emsp; &emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       安全卫士检查记录  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       ${mydate.getYear()}年 ${mydate.getMonth()}月 ${mydate.getDay()}日
     <!-- border:边框宽度，bordercolor:边框颜色 -->	
	<table border="1px" bordercolor="black">
	    <tr>
	           <th  colspan="18">化工公司合成净化车间氨库岗位安全卫士巡检表（每班四次)</th>
	    </tr>
	     <tr>
	           <td  colspan="18">管理概念：控制3个指标（液位、压力、温度），维护好41个安全附件、156只阀门、48个根部<br>
	           法兰、14个常用阀、9个监视器、25个报警装置.</td>
	    </tr>
	    
	     <tr>
	           <td  colspan="18"> <br> </td>
	    </tr>
	    
	    <tr>
	          <th rowspan="2"colspan="1" >序<br>
	                                                                            号</th>
	          <th rowspan="2" colspan="2">项目</th>
	          <th rowspan="2" colspan="3">巡检标准</th>
	          <th colspan="4">早班</th>	
	          <th colspan="4">中班</th>	    
	          <th colspan="4">晚班</th>       
	    </tr>
	     <tr>
	          <td >01</td>     
	          <td >03</td>
	          <td >05</td>
	          <td >07</td>
	          <td >09</td>
	          <td >11</td>
	          <td >13</td>
	          <td >15</td>
	          <td >17</td>
	          <td >19</td>
	          <td >21</td>
	          <td >23</td>
	          
	    </tr>
	    
	    
	    
	    <tr>	
	<!-- c:通过prefix取的别名，可以该为任意值，取名为c是规范，作用是调用forEach方法，
		forEach:相当于for循环，items:里面放循环对象，var:任意取名，然后通过该名调用要显示的值 -->
		<!-- 如果传过来的值只有一条，则不需要使用循环，${detail}:el表达式中放的是传过来的键 -->
		
		<!-- 用detail1输出早班信息 -->

	    </tr>
	    

	    <tr>
	          <td >1</td>
	          <td colspan="2">常用阀（14）关键阀（7）</td>
	          <td rowspan="7" colspan="3">1.阀门填料无泄漏<br>
	                           2.阀体无裂痕<br>       
	                           3.阀门法兰、液位计法兰、压力<br>
	                           表短接法兰及连接法兰无泄漏<br>
	                           4.阀门阀杆，无腐蚀<br>
	                           5.根部法兰完好，无腐蚀<br>
	                           6.阀门无内漏<br>
	                           </td>
	           
               <td >${safetyrecord1.showint(safetyrecord1.getFirst())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFirst())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFirst())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFirst())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFirst())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFirst())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFirst())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFirst())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFirst())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFirst())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFirst())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFirst())}</td>
	    </tr>
	    
        <tr>
	          <td >2</td>
	          <td colspan="2">排污阀（6）关键阀（3）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSecond())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSecond())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSecond())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSecond())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSecond())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSecond())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSecond())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSecond())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSecond())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSecond())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSecond())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSecond())}</td>
	    </tr>
	      <tr>
	          <td >3</td>
	          <td colspan="2">驰放阀（15）关键阀（3）</td>
	           
               <td >${safetyrecord1.showint(safetyrecord1.getThird())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getThird())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getThird())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getThird())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getThird())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getThird())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getThird())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getThird())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getThird())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getThird())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getThird())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getThird())}</td>
	    </tr>
	    
	      <tr>
	          <td >4</td>
	          <td colspan="2">液位计截至阀（32）<br>
	                                            关键阀（12）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getFourth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFourth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFourth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFourth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFourth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFourth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFourth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFourth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFourth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFourth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFourth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFourth())}</td>
	    </tr>
   
          <tr>
	          <td >5</td>
	          <td colspan="2">放空阀（9）关键阀（5）</td>
	           <td >${safetyrecord1.showint(safetyrecord1.getFifth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFifth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFifth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFifth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFifth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFifth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFifth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFifth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFifth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFifth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFifth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFifth())}</td>
	           
	    </tr>
	    
	      <tr>
	          <td >6</td>
	          <td colspan="2">液位计法兰（40）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSixth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSixth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSixth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSixth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSixth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSixth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSixth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSixth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSixth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSixth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSixth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSixth())}</td>
	    </tr>
	    
	      <tr>
	          <td >7</td>
	          <td colspan="2">压力表短接（39）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSeventh())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSeventh())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSeventh())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSeventh())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSeventh())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSeventh())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSeventh())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSeventh())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSeventh())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSeventh())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSeventh())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSeventh())}</td>
	    </tr>
	    
	      <tr>
	          <td >8</td>
	          <td colspan="2">压力表（23）、压力变<br>
	                         送器（16）</td>
	            <td colspan="3">在有效期内；限位标识完好；无<br>
	                         破损，泄露，腐蚀</td>
            <td >${safetyrecord1.showint(safetyrecord1.getEighth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getEighth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getEighth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getEighth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getEighth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getEighth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getEighth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getEighth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getEighth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getEighth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getEighth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getEighth())}</td>
	    </tr>
	    
	    <tr>
	          <td >9</td>
	          <td colspan="2">安全阀（7）</td>
	            <td colspan="3">根部截至阀打开，铅封完好；无<br>
	                                                      腐蚀</td>
                <td >${safetyrecord1.showint(safetyrecord1.getNineth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getNineth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getNineth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getNineth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getNineth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getNineth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getNineth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getNineth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getNineth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getNineth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getNineth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getNineth())}</td>
	    </tr>
	    
	    <tr>
	          <td >10</td>
	          <td colspan="2">液位计（6）</td>
	            <td colspan="3">无泄漏，裂纹，锈蚀等异常情况；<br>
	                 显示准确，无超过上下限位</td>
                <td >${safetyrecord1.showint(safetyrecord1.getTenth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getTenth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getTenth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getTenth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getTenth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getTenth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getTenth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getTenth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getTenth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getTenth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getTenth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getTenth())}</td>
	    </tr>
	    
	    <tr>
	          <td >11</td>
	          <td colspan="2">温度计（5）</td>
	            <td colspan="3">现场取样点是否完好，室内显示<br>
	                是否正常</td>
               <td >${safetyrecord1.showint(safetyrecord1.getEleventh())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getEleventh())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getEleventh())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getEleventh())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getEleventh())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getEleventh())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getEleventh())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getEleventh())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getEleventh())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getEleventh())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getEleventh())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFirst())}</td>
	    </tr>
	    
	    <tr>
	          <td >12</td>
	          <td colspan="2">槽体及连接管道</td>
	            <td colspan="3">保冷完好；无破损，腐蚀，泄漏<br>
	               等异常情况，润滑情况完好，管<br>
	               道标识清晰准确；管道无振动</td>
                <td >${safetyrecord1.showint(safetyrecord1.getTwelveth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getTwelveth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getTwelveth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getTwelveth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getTwelveth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getTwelveth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getTwelveth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getTwelveth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getTwelveth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getTwelveth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getTwelveth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getTwelveth())}</td>
	    </tr>
	    
	    <tr>
	          <td >13</td>
	          <td colspan="2">9个监视器，25个报警<br>
	               装置</td>
	            <td colspan="3">无腐蚀，无泄漏</td>
               <td >${safetyrecord1.showint(safetyrecord1.getThirteenth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getThirteenth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getThirteenth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getThirteenth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getThirteenth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getThirteenth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getThirteenth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getThirteenth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getThirteenth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getThirteenth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getThirteenth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getThirteenth())}</td>
	    </tr>
	      <tr>
	          <td colspan="2">巡检人签名</td>
	          <td colspan="2">早班：${safetyrecordsigs.get(0).getName()} </td>
	            <td colspan="4">中班：${safetyrecordsigs.get(1).getName()}</td>
               <td colspan="10">晚班：${safetyrecordsigs.get(2).getName()}</td>
	    </tr>
	     <tr>
	          <td colspan="2">备注<br>  <br>  <br>  <br> <br>  <br> </td>
	          <td colspan="2">${safetyrecordsigs.get(0).getRemark()}</td>
               <td colspan="4">${safetyrecordsigs.get(1).getRemark()}</td>
               <td colspan="10">${safetyrecordsigs.get(2).getRemark()}</td>
	    </tr>
	     <tr>
	          <td colspan="2">异常情况记<br>
	                              录<br> <br>  <br>  </td>
	          <td colspan="16">1.${safetyrecordsigs.get(0).getException()} <br>
	                               2.${safetyrecordsigs.get(1).getException()}<br>
	                     3.${safetyrecordsigs.get(2).getException()}</td>
	    </tr>
	</table>
</form>
</body>
</html>