package org.newit.microservice.ebusiness.model;

import java.util.Date;

public class Item {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.id
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.name
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.description
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.price
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.quantity
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.created_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.updated_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    private Date updatedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.id
     *
     * @return the value of item.id
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.id
     *
     * @param id the value for item.id
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.name
     *
     * @return the value of item.name
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.name
     *
     * @param name the value for item.name
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.description
     *
     * @return the value of item.description
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.description
     *
     * @param description the value for item.description
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.price
     *
     * @return the value of item.price
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.price
     *
     * @param price the value for item.price
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.quantity
     *
     * @return the value of item.quantity
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.quantity
     *
     * @param quantity the value for item.quantity
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.created_time
     *
     * @return the value of item.created_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.created_time
     *
     * @param createdTime the value for item.created_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.updated_time
     *
     * @return the value of item.updated_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.updated_time
     *
     * @param updatedTime the value for item.updated_time
     *
     * @mbg.generated Wed Jun 05 19:12:51 CST 2019
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}