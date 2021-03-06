import React from 'react'
import {Link} from "react-router-dom"

function UserRow({user}) {
    return (
        <tr>
            <td>{user.name}</td>
            <td>{`${user.surname} ${user.secondSurname}`}</td>
            <td>
                {new Intl.DateTimeFormat("es-ES", {
                year: "numeric",
                month: "long",
                day: "2-digit"
                }).format(new Date(user.dateOfBirth))}
            </td>
            <td>{user.email}</td>
            <td>{user.phone}</td>
            <td>
                <Link to={`/usuarios/${user.id}`}><button className="btn btn-green mr-3">Ver</button></Link> 
            </td>
        </tr>
    )
}

export default UserRow