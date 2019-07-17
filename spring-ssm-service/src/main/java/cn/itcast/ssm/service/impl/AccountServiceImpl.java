package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.domain.Account;
import cn.itcast.ssm.mapper.AccountMapper;
import cn.itcast.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public boolean addAccount(Account account) {
        int row = accountMapper.addAccount(account);
        return row > 0;
    }
}
