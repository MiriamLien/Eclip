package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WidgetOrgId;
import com.example.demo.entity.Widget_org;

@Repository
public interface WidgetOrgDao extends JpaRepository<Widget_org, WidgetOrgId>{
		
}
