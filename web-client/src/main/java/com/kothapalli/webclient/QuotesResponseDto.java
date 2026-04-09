package com.kothapalli.webclient;

import lombok.Data;

import java.util.List;

@Data
public class QuotesResponseDto {

    private List<Quote> quotes;
}
