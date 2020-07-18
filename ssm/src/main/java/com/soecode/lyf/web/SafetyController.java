package com.soecode.lyf.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;














import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;














import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.soecode.lyf.dao.SafetyrecordDao;
import com.soecode.lyf.entity.MyDate;
import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;
import com.soecode.lyf.service.SafetyService;


@Controller
@RequestMapping("safety")
public class SafetyController {
	
	@Autowired
	private SafetyService SafetyService;
	
	private Map<Integer,Safetyrecord> safetyrecords=null;
	
	List<Safetyrecordsig> Safetysigs=null;
	
	MyDate mydate=null;
	
	public String sqldate(String s)
	{
		String dat[]=s.split("-");
		return dat[0]+dat[1]+dat[2];
	}
	
	@RequestMapping("show")
	public String show(@RequestParam("date")String date,Model model)
	{
		if(date=="")return "Error";
		
		String dat[]=date.split("-");
		
		mydate=new MyDate(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]));
		
		System.out.println(sqldate(date));
		
		safetyrecords =SafetyService.queryByDate(sqldate(date));
		
		Safetysigs=SafetyService.queryByDate_sig(sqldate(date));
		
		if(safetyrecords.size()==0&&Safetysigs.size()==0)return "Error";
		
		for(int i=0;i<3;i++)
		{
			if(i>=Safetysigs.size())Safetysigs.add(new Safetyrecordsig());
		}
		
		model.addAttribute("cordate",date);
		
		model.addAttribute("mydate",mydate);
		
		model.addAttribute("safetyrecordsigs",Safetysigs);
		
		model.addAttribute("safetyrecord1",safetyrecords.get(1));
		model.addAttribute("safetyrecord3",safetyrecords.get(3));
		model.addAttribute("safetyrecord5",safetyrecords.get(5));
		model.addAttribute("safetyrecord7",safetyrecords.get(7));
		model.addAttribute("safetyrecord9",safetyrecords.get(9));
		model.addAttribute("safetyrecord11",safetyrecords.get(11));
		model.addAttribute("safetyrecord13",safetyrecords.get(13));
		model.addAttribute("safetyrecord15",safetyrecords.get(15));
		model.addAttribute("safetyrecord17",safetyrecords.get(17));
		model.addAttribute("safetyrecord19",safetyrecords.get(19));
		model.addAttribute("safetyrecord21",safetyrecords.get(21));
		model.addAttribute("safetyrecord23",safetyrecords.get(23));
		return "detailOfSafety";
	}
	
	@RequestMapping("export")
	public void detailOfSafetyExport(HttpServletResponse response,HttpServletRequest request) throws IOException {
		String dates=request.getParameter("dates");
		
		String realPath=request.getSession().getServletContext().getRealPath("/");
    	File file = new File(realPath+"/DetailOfSafety.xlsx");		
    	FileInputStream in =new FileInputStream(file);
			//读取excel模板
		XSSFWorkbook wb = new XSSFWorkbook(in);
			//读取了模板内所有sheet内容
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println("date: "+dates);
		XSSFRow row=null;
		XSSFCellStyle cellStyle=wb.createCellStyle() ;
		XSSFFont font  = wb.createFont(); 
		font.setFontHeight(20);
		
		cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		
		String filename=null;
		
	    if(StringUtils.isNotBlank(dates)) 
	    {
	    	
	    	safetyrecords =SafetyService.queryByDate(sqldate(dates));
			
			Safetysigs=SafetyService.queryByDate_sig(sqldate(dates));
			
			for(int i=0;i<3;i++)
			{
				if(i>=Safetysigs.size())Safetysigs.add(new Safetyrecordsig());
			}
				
				//开始写入数据
				//表头(待更改)
				
			String dat[]=dates.split("-");
			mydate=new MyDate(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]));
			
				System.out.println("date: "+mydate.toString());
				
				row=sheet.getRow(0);
				row.getCell(0).setCellValue("化工公司合成净化车间氨库岗位安全卫士巡检表"+"  "+mydate.toString());		
				
				
				row=sheet.getRow(5);
				String s="";
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFirst()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(6);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSecond()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(7);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getThird()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(8);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFourth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(10);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFifth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(11);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSixth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(12);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSeventh()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(13);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getEighth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(15);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getNineth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(16);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getTenth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(18);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getEleventh()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(20);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getTwelveth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(23);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getThirteenth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(25);
				row.createCell(3).setCellValue("早班："+Safetysigs.get(0).getName());
				row.createCell(8).setCellValue("午班："+Safetysigs.get(1).getName());
				row.createCell(13).setCellValue("晚班："+Safetysigs.get(2).getName());
				
				row=sheet.getRow(26);
				row.createCell(3).setCellValue(Safetysigs.get(0).getRemark());
				row.createCell(8).setCellValue(Safetysigs.get(1).getRemark());
				row.createCell(13).setCellValue(Safetysigs.get(2).getRemark());
				
				row=sheet.getRow(28);
				row.createCell(3).setCellValue("1."+Safetysigs.get(0).getException()+"  "
				+"2."+Safetysigs.get(1).getException()+"  "
				+"3."+Safetysigs.get(2).getException());
				
				filename="export.xlsx";
				
	    }
	    else {
	    	
	    	filename="该表为空表"+".xlsx";
	    }
	 // 设置输出流,实现下载文件
		response.setHeader("Content-Disposition",
				"attachment;filename=" +URLEncoder.encode(filename,"UTF-8"));
				//FileOutputStream out = new FileOutputStream(response.getOutputStream());
		wb.write(response.getOutputStream());
		response.getOutputStream().close();
	}
}
