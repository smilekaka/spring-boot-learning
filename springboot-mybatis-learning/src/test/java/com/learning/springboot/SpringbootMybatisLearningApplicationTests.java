package com.learning.springboot;

import com.learning.springboot.dao.CategoryDao;
import com.learning.springboot.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = SpringbootMybatisLearningApplication.class)
class SpringbootMybatisLearningApplicationTests {

    @Resource
    private CategoryDao categoryDao;

    @Test
    public void selectAllTest() {
        List<Category> categories = categoryDao.selectAll();
        assertEquals(true, categories.size() > 0);
    }

    @Test
    public void insertTest() {
        Category newCategory = new Category();
        newCategory.setCategoryID(1000);
        newCategory.setCategoryName("test");
        newCategory.setDescription("for test");
        int result = categoryDao.insert(newCategory);
        assertEquals(1, result);
    }

    @Test
    public void deleteByExampleTest() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryID", 1000);
        int result = categoryDao.deleteByExample(example);
        assertEquals(1, result);
    }

    @Test
    public void selectByExampleTest() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryID", 1);
        criteria.orEqualTo("categoryID", 2);
        categoryDao.selectByExample(example);
    }

}
