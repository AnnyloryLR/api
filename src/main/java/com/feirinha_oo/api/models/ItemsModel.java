package com.feirinha_oo.api.models;

import com.feirinha_oo.api.dtos.ItemDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "items")
public class ItemsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable= false)
    private String name;

    @Column(nullable = false)
    private Integer quantity;

    public ItemsModel (ItemDTO dto){
        this.name = dto.getName();
        this.quantity = dto.getQuantity();
    }
}

