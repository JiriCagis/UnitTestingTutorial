package database.dao;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * In an application the Data Access Object (DAO) is a part of Data access layer. It is an object
 * that provides an interface to some type of persistence mechanism. By mapping application calls
 * to the persistence layer, DAO provides some specific data operations without exposing details
 * of the database. This isolation supports the Single responsibility principle. It separates what
 * data accesses the application needs, in terms of domain-specific objects and data types
 * (the public interface of the DAO), from how these needs can be satisfied with a specific DBMS,
 * database schema, etc.
 *
 * <p>Any change in the way data is stored and retrieved will not change the client code as the
 * client will be using interface and need not worry about exact source.
 *
 * @see LabelDao
 * @see GenreDao
 * @see ArtistDao
 *
 * Created by cagaj on 23.7.2016.
 */
public interface BaseDao<T> {

    /**
     * @return all {@code T} as a stream. The stream may be lazily or eagerly evaluated based
     *      on the implementation. The stream must be closed after use.
     * @throws Exception if any error occurs.
     */
    Stream<T> getAll() throws Exception;

    /**
     *
     * @param id unique identifier of the item {@code T}
     * @return an optional with item {@code T} if  an item with unique identifier {@code id} exists,
     *      empty optional otherwise.
     * @throws Exception if any error occurs.
     */
    Optional<T> getByID(int id) throws Exception;

    /**
     *
     * @param item to be added
     * @return getting Id when item was persist to database
     * @throws Exception if any error occurs.
     */
    int add(T item) throws Exception;

    /**
     * @param item to be updated
     * @return id handover item
     * @throws Exception if any error occurs.
     */
    int update(T item) throws Exception;

    /**
     * @param item to be deleted
     * @return id handover item
     * @throws Exception if any error occurs.
     */
    int delete(T item) throws Exception;
}
