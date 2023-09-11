package com.xworks.runner;

import com.xworks.dto.NewsPaperDTO;
import com.xworks.repositary.NewsPaperRepositary;
import com.xworks.repositary.NewsPaperRepositaryImpl;
import com.xworks.service.NewsPaperServiceImpl;

public class NewsPaperRunner {
public static void main(String[] info)
{
	NewsPaperRepositary news=new NewsPaperRepositaryImpl();
	NewsPaperServiceImpl news1=new NewsPaperServiceImpl(news);
	NewsPaperDTO dto=new NewsPaperDTO(200,"kannda prabha","Times of india",2);
	NewsPaperDTO dto1=new NewsPaperDTO(200,"kannda prabha","Times of india",2);
	news1.validation(dto);
	news1.validation(dto1);
}
}
