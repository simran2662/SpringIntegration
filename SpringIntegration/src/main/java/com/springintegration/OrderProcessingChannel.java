package com.springintegration;

import java.io.File;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.integration.annotation.Poller;

//@Configuration
//@EnableIntegration
//public class BasicConfigurationConfig {
	/*
	 * public String INP_DIR = "the_src_dir"; public String OUP_DIR =
	 * "the_dest_dir"; public String FILE_PATTERN = "*.MPEG";
	 * 
	 * @Bean public MessageChannel fileChannel() { return new DirectChannel(); }
	 * 
	 * @Bean
	 * 
	 * @InboundChannelAdapter(value = "fileChannel", poller = @Poller(fixedDelay =
	 * "1000")) public FileReadingMessageSource fileReadingMessageSource() {
	 * FileReadingMessageSource sourceReader = new FileReadingMessageSource();
	 * sourceReader.setDirectory(new File(INP_DIR)); sourceReader.setFilter(new
	 * SimplePatternFileListFilter(FILE_PATTERN)); return sourceReader; }
	 * 
	 * 
	 * @Bean
	 * 
	 * @ServiceActivator(inputChannel= "fileChannel") public MessageHandler
	 * fileWritingMessageHandler() { FileWritingMessageHandler handler = new
	 * FileWritingMessageHandler(new File(OUP_DIR));
	 * handler.setFileExistsMode(FileExistsMode.REPLACE);
	 * handler.setExpectReply(false); return handler; }
	 */
	
	
@Configuration
@EnableIntegration
public class OrderProcessingChannel {
  
    @Bean
    public MessageChannel newOrderChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel processingChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel shippedChannel() {
        return new DirectChannel();
    }
	
}


