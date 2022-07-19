package com.project.jejuair.controller.api;


import com.project.jejuair.controller.CrudController;
import com.project.jejuair.model.entity.TbMember;
import com.project.jejuair.model.network.Header;
import com.project.jejuair.model.network.request.TbMemberRequest;
import com.project.jejuair.model.network.response.TbExtraServiceResponse;
import com.project.jejuair.model.network.response.TbMemberResponse;
import com.project.jejuair.service.TbExtraServiceApiLogicService;
import com.project.jejuair.service.TbMemberApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class TbMemberApiController extends CrudController <TbMemberRequest, TbMemberResponse, TbMember> {


    private final TbMemberApiLogicService tbMemberApiLogicService;


    @Override
    @PostMapping("")
    public Header<TbMemberResponse> create(@RequestBody Header<TbMemberRequest> request) {
        return tbMemberApiLogicService.create(request);
    }

    @Override
    @GetMapping("{mem_idx}")
    public Header<TbMemberResponse> read(@PathVariable(name = "mem_idx") Long idx) {
        return tbMemberApiLogicService.read(idx);
    }

    @Override
    @PutMapping
    public Header<TbMemberResponse> update(@RequestBody Header<TbMemberRequest> request) {
        return tbMemberApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{mem_idx}")
    public Header<TbMemberResponse> delete(@PathVariable Long idx) {
        return tbMemberApiLogicService.delete(idx);
    }

    @GetMapping("")
    public Header<List<TbMemberResponse>> findAll(@PageableDefault(sort = {"mem_idx"}, direction = Sort.Direction.DESC) Pageable pageable){
        return tbMemberApiLogicService.search(pageable);
    }
}
