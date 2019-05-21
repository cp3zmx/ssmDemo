package com.ays.model;

/**
 * 员工等级实体
 * t_rank
 *
 */
public class Rank {
    /**
     *
     * t_rank.id
     *
     * @mbg.generated 2019-05-21 11:32:19
     */
    private Integer id;

    /**
     *
     * t_rank.rank
     *
     * @mbg.generated 2019-05-21 11:32:19
     */
    private Integer rank;

    /**
     *
     * t_rank.description
     *
     * @mbg.generated 2019-05-21 11:32:19
     */
    private String description;

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public Integer getId() {
        return id;
    }

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public String getDescription() {
        return description;
    }

    /**
     * @mbg.generated 2019-05-21 11:32:19
     */
    public void setDescription(String description) {
        this.description = description;
    }
}