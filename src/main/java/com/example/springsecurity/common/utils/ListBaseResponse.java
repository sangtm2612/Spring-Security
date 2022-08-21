package com.example.springsecurity.common.utils;

import com.example.springsecurity.common.consts.StatusCode;
import lombok.Data;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public class ListBaseResponse<T> extends BaseResponse{
    private List<T> data;
    private Pagination pagination;

    public ListBaseResponse(PageImpl<T> data) {
        this.data = data.getContent();
        this.pagination = new Pagination();

        pagination.setTotal(data.getTotalElements());
        pagination.setPageSize(data.getSize());
        pagination.setTotalPage(data.getTotalPages());
        pagination.setPageNumber(data.getNumber());

        this.code = StatusCode.STATUS_CODE_OK;
        this.message = "Success";
    }

    @Data
    static class Pagination {
        private int pageSize;
        private int pageNumber;
        private int totalPage;
        private long total;
    }
}
