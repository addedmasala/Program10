package com.example.LabCycle10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabCycle10Application {

	public static void main(String[] args) {
		SpringApplication.run(LabCycle10Application.class, args);
	}

}




































































































//
//minikube start --driver=docker
//minikube status
//add maven install
//eval $(minikube docker-env)
//sudo docker build -t myprg10 .
//kubectl create -f kuber.yml
//minikube services myapp-service
//post data
//minikube dashboard