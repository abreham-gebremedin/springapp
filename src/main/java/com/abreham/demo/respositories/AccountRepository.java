package com.abreham.demo.respositories;

import com.abreham.demo.domains.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Create, Read, Update, Delete
 *
 * @author Biniam Asnake
 */
public interface AccountRepository  extends CrudRepository<Account, Long> {
}
