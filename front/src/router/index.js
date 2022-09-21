import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/main/Main'),
  },
  {
    path: '/Comics',
    name: 'Comics',
    component: () => import('@/components/main/Comics'),
  },
  {
    path: '/Comics/:title',
    name: 'ComicPost',
    component: () => import('@/components/post/ComicPost'),
  },
  {
    path: '/Music',
    name: 'Music',
    component: () => import('@/components/main/Music'),
  },
  {
    path: '/PostDetail',
    name: 'PostDetail',
    component: () => import('@/components/post/PostDetail'),
  },
]

export default createRouter({
  history: createWebHistory(),
  routes
})