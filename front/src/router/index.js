import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/main/Main'),
  },
  {
    path: '/comics',
    name: 'Comics',
    component: () => import('@/components/main/Comics'),
  },
  {
    path: '/comics/:title',
    name: 'ComicIndex',
    component: () => import('@/components/post/comic/ComicIndex'),
  },
  {
    path: '/comics/:title/content',
    name: 'ComicContent',
    component: () => import('@/components/post/comic/ComicContent'),
  },
  {
    path: '/comics/:title/detail',
    name: 'ComicPostDetail',
    component: () => import('@/components/post/PostDetail')
  },
  {
    path: '/music',
    name: 'Music',
    component: () => import('@/components/main/Music'),
  },
  {
    path: '/music/:title/detail',
    name: 'MusicPostDetail',
    component: () => import('@/components/post/PostDetail')
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