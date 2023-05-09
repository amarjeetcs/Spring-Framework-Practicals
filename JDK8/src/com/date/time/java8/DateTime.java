package com.date.time.java8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class DateTime {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.from(LocalDate.now());
		System.out.println(ld);
	}
}