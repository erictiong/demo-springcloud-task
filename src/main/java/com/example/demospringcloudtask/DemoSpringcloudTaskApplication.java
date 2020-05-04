package com.example.demospringcloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class DemoSpringcloudTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudTaskApplication.class, args);
    }
    @Bean
      public TollProcessingTask tollProcessingTask(){
        return new TollProcessingTask();
      }
      public class  TollProcessingTask implements CommandLineRunner   {

          @Override
          public void run(String... args) throws Exception {
              //parameter stationid, license plate, timestamp
              if (null != args)    {
                   System.out.println("Parameter length is " + args.length);
                   String stationID  = args[0];
                   String licensePlate  = args[1];
                   String timestamp  = args[2];
                   System.out.println("Station ID is " +stationID + ", licence is " + licensePlate+", timestamp is " + timestamp);
              }
          }
      }


}
