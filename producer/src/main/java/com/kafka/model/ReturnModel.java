
package com.kafka.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "firstNumber", "secondNumber" })
public class ReturnModel {

	@JsonProperty("firstNumber")
	private int firstNumber;
	@JsonProperty("secondNumber")
	private int secondNumber;
	@JsonProperty("sum")
	private int sum;
	@JsonProperty("producerCorrelationId")
	private String producerCorrelationId;
	@JsonProperty("consumerCorrelationId")
	private String consumerCorrelationId;

	@JsonProperty("firstNumber")
	public int getFirstNumber() {
		return firstNumber;
	}

	@JsonProperty("firstNumber")
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	@JsonProperty("secondNumber")
	public int getSecondNumber() {
		return secondNumber;
	}

	@JsonProperty("secondNumber")
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	@JsonProperty("sum")
	public int getSum() {
		return sum;
	}
	@JsonProperty("sum")
	public void setSum(int sum) {
		this.sum = sum;
	}
	@JsonProperty("producerCorrelationId")
	public String getProducerCorrelationId() {
		return producerCorrelationId;
	}
	@JsonProperty("producerCorrelationId")
	public void setProducerCorrelationId(String producerCorrelationId) {
		this.producerCorrelationId = producerCorrelationId;
	}
	@JsonProperty("consumerCorrelationId")
	public String getConsumerCorrelationId() {
		return consumerCorrelationId;
	}
	@JsonProperty("consumerCorrelationId")
	public void setConsumerCorrelationId(String consumerCorrelationId) {
		this.consumerCorrelationId = consumerCorrelationId;
	}


}