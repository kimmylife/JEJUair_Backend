package com.project.jejuair.service;


import com.project.jejuair.model.entity.TbExtraService;
import com.project.jejuair.model.network.Header;
import com.project.jejuair.model.network.request.TbExtraServiceRequest;
import com.project.jejuair.model.network.response.TbExtraServiceResponse;

public class TbExtraServiceApiLogicService extends BaseService<TbExtraServiceRequest, TbExtraServiceResponse, TbExtraService>{
    @Override
    public Header<TbExtraServiceResponse> create(Header<TbExtraServiceRequest> request) {
        return null;
    }

    @Override
    public Header<TbExtraServiceResponse> read(Long idx) {
        return null;
    }

    @Override
    public Header<TbExtraServiceResponse> update(Header<TbExtraServiceRequest> request) {
        return null;
    }

    @Override
    public Header<TbExtraServiceResponse> delete(Long idx) {
        return null;
    }
}
