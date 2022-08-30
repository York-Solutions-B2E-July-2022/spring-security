# What does that class do?????

I have found that many of these classes are just interfaces to build off of.
Many of the classes listed are simply used to organize objects in your code.

## BCryptPasswordEncoder

A class that implements the BCrypt strong hashing function. 
In other words we are specifying that we want to use the particular hashing 
function *BCrypt* to encode a String.

## PasswordEncoder

And interface for encoding passwords. In my current use case it is a
BCryptPasswordEncoder.

## CommandLineRunner
An interface used to indicate that a bean should run when it is contained within
a SpringApplication (in my case this is SecutirydemoApplication.java).

## Collection<>

An interface that Represents a group of objects, known as its elements. There are
some options that collection provides that differ it from a List<>.
Collections can choose to contain duplicate objects or not and can be ordered 
or not.
Collections are very general, they are less specific than Lists.

## SimpleGrantedAuthority

A simple implementation of GrantedAuthority.
It stores a string representation of an authority granted to the Authentication
object.

## GrantedAuthority

Represents an authority granted to an Authentication object.

## Authentication

An interface that represents the token for an authentication request.

## AuthenticationManager

Processes an authentication request

## UsernameNotFoundException

A exception that is thrown if an UserDetailsService implementation cannot locate 
a user by its username.

## UserDetailsService

The core interface that loads user data.

## UserDetails

An interface that provides core user information. 

## Bean <sub><sup>(yum)<sup><sub>

An object that is instantiated, assembled, and otherwise managed by a Spring
Spring IoC container.

### Spring Ioc Container (not a class, but a concept)
A mechanism to achieve loose-coupling between objects dependencies.
The SpringIoC injects dependencies into an object and make it ready for use.

## WebSecurityConfigurerAdapter

Provides a convenient bade class for creating a WebSecurityConfigurer instance.

## UsernamePasswordAuthenticationFilter

Processes an authentication form submission.

## HttpServletRequest

Extends the ServletRequest interface to provide request information for HTTP 
servlets. 

## ServletRequest

Defines an object to provide client request information to a servlet.

## Servlet

The programs that run on a java enabled web server. They are used to handle the
request obtained from the webserver, process the request, and produce a response.

## HttpServletResponse

Extends the ServletResponse to provide http specific functionality in sending a
response. 
It has methods to access http headers and cookies.

## ServletResponse

Defines an object to assist a servlet in sending a response to the client. 
(the person accessing the browser)

## FilterChain

An object provided by the servlet container to the developer giving a view into
the invocation chain of a filtered reequst for a response.
Filters use chain to invoke the next filter in the chain or invoke the resourse
at the end of the chain.

## Filter

An object that performs filtering tasks on either the request to a resource,
or on the response from a resource, or both.

## OncePerRequestFilter
A filter base class that aims to guarantee a **single execution** per request
dispatch, on any servlet container.

## Algorithm

A class that represents an algorithm to be used in the signing or verification
of a Token.

## JWTVerifier

A class that holds the verify method to assert that a given Token has not only a
proper jwt format, but also a matching signature.

## DecodedJWT

A class that represents a Json web token that was decoded forom it's string 
representation.

## UsernamePasswordAuthenticationToken

An Authentication implementation that is designed for simple presentation of a
username and password.

## 