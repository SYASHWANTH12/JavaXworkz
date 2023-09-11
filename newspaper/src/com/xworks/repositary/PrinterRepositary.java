package com.xworks.repositary;

import com.xworks.dto.PrinterDTO;

public interface PrinterRepositary {


public void save(PrinterDTO  dto);

public boolean isExist(PrinterDTO dto);
}
