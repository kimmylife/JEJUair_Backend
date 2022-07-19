package com.project.jejuair.controller.api;


import com.project.jejuair.controller.CrudController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class TbFlightScheduleApiController extends CrudController<> {
}
