
package com.myApp.repositories;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myApp.entity.ExpenseEntity;

// TODO: Auto-generated Javadoc
/*** The Interface CCDetailsExcepRepository. */

public interface ExpenseEntityRepository extends JpaRepository<ExpenseEntity, Timestamp> {

	/**
	 * Find by acc num.
	 *
	 * @param accNum
	 *        the acc num
	 * @return the list
	 */
	@Query("select x from ExpenseEntity")
	List<ExpenseEntity> findAllExpense(BigDecimal accNum);

}
