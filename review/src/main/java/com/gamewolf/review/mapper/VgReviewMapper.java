package com.gamewolf.review.mapper;

import com.gamewolf.review.model.VgReview;
import com.gamewolf.review.model.VgReviewExample;
import com.gamewolf.review.model.VgReviewWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VgReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    long countByExample(VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int deleteByExample(VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int insert(VgReviewWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int insertSelective(VgReviewWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    List<VgReviewWithBLOBs> selectByExampleWithBLOBs(VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    List<VgReview> selectByExample(VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    VgReviewWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByExampleSelective(@Param("row") VgReviewWithBLOBs row, @Param("example") VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("row") VgReviewWithBLOBs row, @Param("example") VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByExample(@Param("row") VgReview row, @Param("example") VgReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByPrimaryKeySelective(VgReviewWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(VgReviewWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_review
     *
     * @mbg.generated Mon Jul 17 21:52:19 CST 2023
     */
    int updateByPrimaryKey(VgReview row);
}