export default [
  {
    path: 'signIn',
    name: 'signIn',
    component: () => import('@/components/user/SignIn')
  },
  {
    path: 'signUp',
    name: 'signUp',
    component: () => import('@/components/user/SignUp')
  },
]