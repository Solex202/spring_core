package com.example.lota.com.Configuring.Core.Spring.Application.mappers;

import com.example.lota.com.Configuring.Core.Spring.Application.dto.UpdateExpenseDto;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {


    Expense updateExpense(UpdateExpenseDto updateExpenseDto, Expense expense);
}
