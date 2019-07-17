package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    boolean addAccount(Account account);

}
