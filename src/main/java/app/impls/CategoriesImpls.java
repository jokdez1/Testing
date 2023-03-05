package app.impls;


import app.daos.CategoriesDao;
import app.models.Categories;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class CategoriesImpls implements CategoriesDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int createCategory() {
        return 0;
    }

    @Override
    public List<Categories> getAllCategories() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Categories");
        List<Categories> categories=query.list();
        session.flush();
        return categories;
    }

    @Override
    public Categories getCategoryById() {
        return null;
    }

    @Override
    public int updateCategory() {
        return 0;
    }

    @Override
    public int deleteCategory() {
        return 0;
    }
}
